package com.jasper.controller;


import java.io.FileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jasper.Services.PdfService;

import net.sf.jasperreports.engine.JRException;


@RestController
public class JsPdfController {
	@Autowired
	private PdfService pdfService;
	
	 @GetMapping("/home")
	 public String getpdf() {
		 
		return "pdf";
	 }
	
	
	@GetMapping("pdf/{formate}")
	public String generatepdf(@PathVariable String formate) throws FileNotFoundException, JRException {
		
		pdfService.generatePdf(formate);
	
		return "Pdf File Generated successfully";
	}
	
          
}
