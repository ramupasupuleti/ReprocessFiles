package com.reprocess.forms;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class ReprocessFileForm {
	
	private int selectedFileType;
	
	private String inputParams;
	
	
	public String getInputParams() {
		return inputParams;
	}

	public void setInputParams(String inputParams) {
		this.inputParams = inputParams;
	}

	public int getSelectedFileType() {
		return selectedFileType;
	}

	public void setSelectedFileType(int selectedFileType) {
		this.selectedFileType = selectedFileType;
	}

	private List<String> fileTypes;

	public List<String> getFileTypes() {
		return fileTypes;
	}

	public void setFileTypes(List<String> fileTypes) {
		this.fileTypes = fileTypes;
	}

	@Override
	public String toString() {
		return "ReprocessFileForm [selectedFileType=" + selectedFileType + ", inputParams=" + inputParams
				+ ", fileTypes=" + fileTypes + "]";
	}

	
	
	

}
