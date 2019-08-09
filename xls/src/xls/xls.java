package xls;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class xls {

	public static void main(String[] args) throws IOException {
		//java读和写Excel文件
		//生成工作簿
		HSSFWorkbook wb = new HSSFWorkbook();
		//生成工作表sheet
		HSSFSheet sheet1 = wb.createSheet();
		HSSFSheet sheet2 = wb.createSheet("工资表");
		//生成行
		HSSFRow row1 = sheet1.createRow(0);
		//生成列
		HSSFCell cell1 = row1.createCell((short) 0);
		//添加数据
		cell1.setCellValue("aaaaa");
		//输出流
		FileOutputStream fos = new FileOutputStream("e:/a.xlsx");
		wb.write(fos);
		fos.close();
		

	}

}
