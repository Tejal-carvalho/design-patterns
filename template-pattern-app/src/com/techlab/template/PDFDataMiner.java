package com.techlab.template;

public class PDFDataMiner extends DataMiner {
	public PDFDataMiner(int a) {

	}

	@Override
	protected void loadFile(String filepath) {
		System.out.println("Loading file...." + filepath);

	}

	@Override
	protected void readFile(String filepath) {
		System.out.println("reading file....." + filepath);

	}

	@Override
	protected void cleanData(String filedata) {
		System.out.println("cleaning file data...." + filedata);

	}

}
