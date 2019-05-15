Dim texcel

Set texcel = CreateObject ("Excel.Application")

texcel.Visible = True
texcel.Workbooks.add
texcel.sheets.add

texcel.cells(1,1).Value = "Monday"
texcel.cells(1,2).Value = "Month"
texcel.cells(2,1).Value = "Tuesday"
texcel.cells(2,2).Value = "May"
texcel.cells(3,1).Value = "Wednesday"

texcel.ActiveWorkbook.SaveAs "C:\Users\ACER\Desktop\Claims Payments\Demo.xlsx"
texcel.Workbooks.Close
texcel.Application.Quit

