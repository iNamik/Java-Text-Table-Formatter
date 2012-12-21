/*
 * iNamik TableFormatter for Java
 * Copyright (C) 2005-2012 David Farrell (davidpfarrell@yahoo.com)
 *
 * Licensed under MIT or GPLv3, see LICENSE.txt
 */
package com.inamik.utils;

/**
 * TableFormatter
 * Created on Oct 18, 2005
 * @author Dave
 */
public interface TableFormatter
{
	static final int ALIGN_DEFAULT = 0;
	static final int ALIGN_LEFT    = 1;
	static final int ALIGN_CENTER  = 2;
	static final int ALIGN_RIGHT   = 3;

	static final int VALIGN_DEFAULT = 4;
	static final int VALIGN_TOP     = 5;
	static final int VALIGN_CENTER  = 6;
	static final int VALIGN_BOTTOM  = 7;

	TableFormatter nextRow();
	TableFormatter nextCell();
	TableFormatter nextCell(int align, int valign);
	TableFormatter addLine();
	TableFormatter addLine(String text);
	int getColumnCount();
	int getRowCount();
	int getColumnWidth(int columnIndex);
	int getRowHeight(int rowIndex);
	int getTableWidth();
	int getTableHeight();
	String[] getFormattedCell(int rowIndex, int columnIndex);
	String[] getFormattedRow(int rowIndex);
	String[] getFormattedTable();
}
