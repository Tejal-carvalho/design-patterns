package com.techlab.template.test;

import com.techlab.template.DocDataMiner;
import com.techlab.template.PDFDataMiner;

public class DataMinerTest {

	public static void main(String[] args) {
		PDFDataMiner pdfminer=new PDFDataMiner(10);
		pdfminer.mineData("pdf");
		System.out.println();
		DocDataMiner docminer=new DocDataMiner();
		docminer.mineData("doc");
	}

}
