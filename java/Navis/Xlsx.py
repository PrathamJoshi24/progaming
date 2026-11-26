"Xlsx.py"

import openpyxl as xl

def file():
    while True:
        try:    
            name=input("file name ")
            if name=="//x":
                pass
            wb=xl.load_workbook(f"{name}.xlsx")
            sheet=wb['Sheet1']
            break
        except FileNotFoundError:
            print("file not found")
    print("""
    + to add
    - to subtract
    * to multiply
    / to divide
    """)
    edits=input("<> ")
    edit_by=float(input("<> "))


    def add():
        discounted_cell=cell.value+edit_by

    def multi():
        discounted_cell=cell.value*edit_by

    def divide():
        discounted_cell=cell.value/edit_by

    def sub():
        discounted_cell=cell.value-edit_by


    while True:
        for row in range(2,sheet.max_row+1):
            cell=sheet.cell(row,2)
            if edits=="+":
                discounted_cell=cell.value+edit_by
            elif edits=="-":
                discounted_cell=cell.value-edit_by
            elif edits=="*":
                discounted_cell=cell.value*edit_by
            elif edits=="/":
                discounted_cell=cell.value/edit_by
            else:
                print("not a valid operation")

            dis_cell_place=sheet.cell(row,3)
            dis_cell_place.value=discounted_cell
            break
        wb.save("book.xlsx")
        print("done")
        break
