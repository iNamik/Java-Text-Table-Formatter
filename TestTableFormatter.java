import com.inamik.utils.*;
import java.util.List;

public class TestTableFormatter
{
	public static void main(String[] args)
	{
		TableFormatter tf = new SimpleTableFormatter(true) // true = show border
		.nextRow()
			.nextCell()
				.addLine(".")
			.nextCell()
				.addLine("..........")
			.nextCell()
				.addLine(" ")
			.nextCell()
				.addLine("..........")
			.nextCell()
				.addLine(" ")
			.nextCell()
				.addLine("..........")
		.nextRow()
			.nextCell()
				.addLine(".")
				.addLine(".")
				.addLine(".")
				.addLine(".")
			.nextCell(TableFormatter.ALIGN_LEFT, TableFormatter.VALIGN_TOP)
				.addLine("Left")
				.addLine("Top")
			.nextCell()
			.nextCell(TableFormatter.ALIGN_LEFT, TableFormatter.VALIGN_CENTER)
				.addLine("Left")
				.addLine("Center")
			.nextCell()
			.nextCell(TableFormatter.ALIGN_LEFT, TableFormatter.VALIGN_BOTTOM)
				.addLine("Left")
				.addLine("Bottom")
		.nextRow().nextCell().addLine(" ")
		.nextRow()
			.nextCell()
				.addLine(".")
				.addLine(".")
				.addLine(".")
				.addLine(".")
			.nextCell(TableFormatter.ALIGN_CENTER, TableFormatter.VALIGN_TOP)
				.addLine("Center")
				.addLine("Top")
			.nextCell()
			.nextCell(TableFormatter.ALIGN_CENTER, TableFormatter.VALIGN_CENTER)
				.addLine("Center")
				.addLine("Center")
			.nextCell()
			.nextCell(TableFormatter.ALIGN_CENTER, TableFormatter.VALIGN_BOTTOM)
				.addLine("Center")
				.addLine("Bottom")
		.nextRow().nextCell().addLine(" ")
		.nextRow()
			.nextCell()
				.addLine(".")
				.addLine(".")
				.addLine(".")
				.addLine(".")
			.nextCell(TableFormatter.ALIGN_RIGHT, TableFormatter.VALIGN_TOP)
				.addLine("Right")
				.addLine("Top")
			.nextCell()
			.nextCell(TableFormatter.ALIGN_RIGHT, TableFormatter.VALIGN_CENTER)
				.addLine("Right")
				.addLine("Center")
			.nextCell()
			.nextCell(TableFormatter.ALIGN_RIGHT, TableFormatter.VALIGN_BOTTOM)
				.addLine("Right")
				.addLine("Bottom")
		;
		System.out.println("\t         1         2         3         4");
		System.out.println("\t1234567890123456789012345678901234567890");
		String[] table = tf.getFormattedTable();

		for (int i = 0, size = table.length; i < size; i++)
		{
			System.out.println( (i + 1) + "\t" + table[i]);
		}

		System.out.println();
		System.out.println("Table size = " + tf.getTableWidth() + " x " + tf.getTableHeight());
	}
}
