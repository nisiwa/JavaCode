package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by little Stone
 * Date 2019/3/25 Time 10:26
 */
@Controller
public class MainController {
	@RequestMapping("form")
	public String form(){
		return "form";
	}
	@RequestMapping("form2")
	public String form2(){
		return "form2";
	}

	@RequestMapping("fileUpload")
	public String fileUpload(MultipartFile myfile) throws IOException {
		File file = new File("e:/abc.txt");
		myfile.transferTo(file);
		return "success";
	}
	@RequestMapping("filesUpload")
	public String filesUpload(MultipartFile[] myfiles) throws IOException{
		int index = 0;
		String filenamePreffix = "E:/abc";
		for (MultipartFile myfile: myfiles)
		{
			String filename = filenamePreffix + (index++) + ".txt";
			File file = new File(filename);
			myfile.transferTo(file);
		}
		return "success";
	}
}
