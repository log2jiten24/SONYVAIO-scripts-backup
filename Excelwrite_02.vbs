Dim texcel ,objfso

Set texcel = CreateObject ("Excel.Application")
Set objfso = CreateObject ("Scripting.FileSystemObject")

Filepath = "C:\Users\ACER\Desktop\Claims Payments\Demo2.xlsx"

'then make excel visible 

texcel.Application.Visible = true

If not objfso.FileExists(Filepath) Then 

texcel.Workbooks.Add

texcel.sheets.add

texcel.cells(1,1).Value = "Monday"
texcel.cells(1,2).Value = "Month"
texcel.cells(2,1).Value = "Tuesday"
texcel.cells(2,2).Value = "May"
texcel.cells(3,1).Value = "Wednesday"

texcel.ActiveWorkbook.SaveAs "C:\Users\ACER\Desktop\Claims Payments\Demo2.xlsx"

else 
print "FileExists - already present"

texcel.Workbooks.Open (Filepath)

End If 

'Close the excel
texcel.Workbooks.Close
texcel.Application.Quit

'Release the object 

Set texcel = Nothing
Set objfso = Nothing
