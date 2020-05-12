package com.stock.controller;

import java.io.InputStream;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.stock.entity.StockPrice;
import com.stock.service.ImportService;
import com.stock.service.StockPriceService;


/**
 * 导入Excel相关的功能
 * 
 * @author JianZhang
 */
@RestController
public class FileuploadController {
	
    /**
     * 实现文件上传
     * */
    @Autowired
    private ImportService importService;
    
    @Autowired
    private StockPriceService stockPriceService;

    /**
     * 文件上传
     * 
     * @return String
     */
    @PostMapping(value = "/api/upload")
    @ResponseBody
    public String uploadExcel(HttpServletRequest request) throws Exception {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        MultipartFile file = multipartRequest.getFile("file_data");
        if (file.isEmpty()) {
            return "文件不能为空";
        }
        InputStream inputStream = file.getInputStream();
        List<List<Object>> list = importService.getBankListByExcel(inputStream, file.getOriginalFilename());
        inputStream.close();

        StockPrice stockPrice = new StockPrice();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0; i < list.size(); i++) {
            List<Object> lo = list.get(i);
            if (lo.size() != 5) {
            	break;
            } else {
            	stockPrice.setStockCode(String.valueOf(lo.get(0)));
            	stockPrice.setStockExchange(String.valueOf(lo.get(1)));
            	stockPrice.setCurrentPrice(String.valueOf(lo.get(2)));
            	//new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(String.valueOf(lo.get(3)) + String.valueOf(lo.get(4)))
            	stockPrice.setDateTime(Timestamp.valueOf(sdf2.format(sdf.parse(String.valueOf(lo.get(3)) + String.valueOf(lo.get(4))))));
            	stockPriceService.save(stockPrice);
            }
            System.out.println(lo);

        }
        return "updateload success";
    }
}				