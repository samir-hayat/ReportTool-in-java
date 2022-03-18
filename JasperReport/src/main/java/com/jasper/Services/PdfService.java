package com.jasper.Services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class PdfService {

public String  generatePdf(String reportFormat) throws FileNotFoundException, JRException {
		
		String path="C:\\Users\\s.hayat\\Documents\\pdfFile";
		
		//File file =ResourceUtils.getFile("classpath:src")
		JRBeanCollectionDataSource jrBnCollectiondDs=new JRBeanCollectionDataSource(null);
		JasperReport compileReport=JasperCompileManager.compileReport(new FileInputStream("src/main/resources/invoice.jrxml"));
		 
		HashMap<String ,Object> map= new HashMap<>();
		JasperPrint report=JasperFillManager.fillReport(compileReport, map,jrBnCollectiondDs);
		
		//create for html
		if (reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(report,path+"\\invoice.pdf");
		}
		if (reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(report,path+"\\invoice.Html");
		}
		return "Generated";
	}
	
}
