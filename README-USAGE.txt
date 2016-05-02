Just a simple set of classes to help print text in tabulated form.

With these classes you can organize 'cells' of data into rows and columns.
Each cell can contain multiple lines of text and may specify a horizontal 
alignment (left, center, right) and a vertical alignment (top, center, bottom).

When you are ready to print the data, these classes will ensure that all cells 
in a given column have the same width and all cells in a given row have 
the same height.

Below is a little test proggy and, below that, the output of the proggy.

--- TestTableFormatter.java ---
import com.inamik.utils.*;
import java.util.List;

public class TestTableFormatter
{
	public static void main(String[] args)
	{
		TableFormatter tf = new SimpleTableFormatter(true)
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
--- Test Program Output ---
	         1         2         3         4
	1234567890123456789012345678901234567890
1	+-+----------+-+----------+-+----------+
2	|.|..........| |..........| |..........|
3	+-+----------+-+----------+-+----------+
4	|.|Left      | |          | |          |
5	|.|Top       | |Left      | |          |
6	|.|          | |Center    | |Left      |
7	|.|          | |          | |Bottom    |
8	+-+----------+-+----------+-+----------+
9	| |          | |          | |          |
10	+-+----------+-+----------+-+----------+
11	|.|  Center  | |          | |          |
12	|.|   Top    | |  Center  | |          |
13	|.|          | |  Center  | |  Center  |
14	|.|          | |          | |  Bottom  |
15	+-+----------+-+----------+-+----------+
16	| |          | |          | |          |
17	+-+----------+-+----------+-+----------+
18	|.|     Right| |          | |          |
19	|.|       Top| |     Right| |          |
20	|.|          | |    Center| |     Right|
21	|.|          | |          | |    Bottom|
22	+-+----------+-+----------+-+----------+

Table size = 40 x 22
