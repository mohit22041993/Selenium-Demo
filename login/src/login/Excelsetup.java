package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsetup {

	@Test

	public void excelread() throws Exception

	{

		{

			File src = new File("C:\\Users\\Mohit\\Desktop\\Excel Data\\Data.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			int rowcount = sh1.getLastRowNum();
			int countg = sh1.getRow(1).getLastCellNum();
			for (int i = 0; i <= rowcount; i++) {
				for (int j = 0; j < countg; j++)

				{
					XSSFCell cell = sh1.getRow(i).getCell(j);
					String celltext = "";
					

					if (cell.getCellType() == cell.CELL_TYPE_STRING)

					{

						celltext = cell.getStringCellValue();
						System.out.println(celltext);

					}
					else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
					{
						
						
					}

				}

			}

		}

	}
}
