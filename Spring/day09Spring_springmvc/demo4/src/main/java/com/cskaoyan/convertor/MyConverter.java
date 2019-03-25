package com.cskaoyan.convertor;

import com.cskaoyan.bean.User;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by little Stone
 * Date 2019/3/25 Time 14:32
 */
public class MyConverter implements Converter<String,Date> {
	@Override
	public Date convert(String s) {
		/*String text = "id-username-passowrd-age";
		String id= "id";
		String username = "name";
		return new User(id,username,password,age);*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = null;
		try {
			parse = simpleDateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parse;
	}
}
