package com.spring.mvc.service.border;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mvc.dao.MyBatisBorderDAO;
import com.spring.mvc.model.BorderInsertModel;
import com.spring.mvc.model.beans.BorderBean;

@Service
public class BorderInsertService {

	@Autowired
	private MyBatisBorderDAO myBatisBorderDAO;
	
	public void fileUpload(BorderInsertModel borderInsertModel) throws IllegalStateException, IOException {
		MultipartFile multipartFile = borderInsertModel.getFile();
		String originalFile = multipartFile.getOriginalFilename();
		String originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
		//lastIndexOf파일에 붙는 확장자에	 .이 붙어있으니 .앞까지를 잘라줘라는 뜻; 이렇게하면 .뒤의 확장자만을 들고옴
		String tempFile = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
		String filePath = "C:\\스프링 프로젝트 파일업로드\\";
		File file = new File(filePath + tempFile);
		multipartFile.transferTo(file);
		
		BorderBean borderBean = new BorderBean();
		borderBean.setBorder_title(borderInsertModel.getBorder_title());
		borderBean.setBorder_content(borderInsertModel.getContent_textarea());
		borderBean.setBorder_file(originalFile);
		borderBean.setBorder_tempfile(tempFile);
		borderBean.setWriter_name(borderInsertModel.getUser_name());
		borderBean.setWriter_ip(borderInsertModel.getUser_ip());
		
		int insertCount = myBatisBorderDAO.insertBorder(borderBean);
		if(insertCount > 0) {
			
		}
	}
}
