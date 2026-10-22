from reportlab.lib.pagesizes import letter
from reportlab.platypus import SimpleDocTemplate, Paragraph, Spacer, Table, TableStyle
from reportlab.lib.styles import getSampleStyleSheet, ParagraphStyle
from reportlab.lib import colors

def generate_report():
    file_name = "MAD_W_GroupID_Task1_Report_Final.pdf"
    doc = SimpleDocTemplate(file_name, pagesize=letter)
    styles = getSampleStyleSheet()
    
    # Custom Styles
    title_style = ParagraphStyle(
        'TitleStyle',
        parent=styles['Heading1'],
        fontSize=16,
        alignment=1,
        spaceAfter=12
    )
    
    section_style = ParagraphStyle(
        'SectionStyle',
        parent=styles['Heading2'],
        fontSize=12,
        spaceBefore=12,
        spaceAfter=6,
        textColor=colors.blue
    )
    
    normal_style = styles['Normal']
    
    elements = []
    
    # Header
    elements.append(Paragraph("THE UNIVERSITY OF LAHORE", title_style))
    elements.append(Paragraph("Faculty of Information Technology | Department of Software Engineering", styles['Normal']))
    elements.append(Spacer(1, 12))
    elements.append(Paragraph("Mobile Application Development (CS02310) - Lab Project", styles['Heading2']))
    elements.append(Paragraph("Task 1 Report: Create the UI and Layouts - SpendWise", styles['Heading3']))
    elements.append(Spacer(1, 24))
    
    # 1. Project Details
    elements.append(Paragraph("1 Project and submission details", section_style))
    details_data = [
        ["App title", "SpendWise - personal expense tracker"],
        ["Section / Task", "Section W / Task 1 (Create the UI and layouts)"],
        ["Submission date", "22-10-2026"],
        ["Selected stack", "Kotlin, Android Studio (RecyclerView and Material Components)"],
        ["Group ID", "Group W-SpendWise"],
        ["Members", "Muhammad Faisal Rehman (70150146)\nAhmed Shahid (70149224)"],
        ["GitHub Repository", "https://github.com/Faisalrehman14/madproject"],
        ["Branch / SHA", "main / 7822b837cb1467381457b8b7a6eb1a3704514aa3"]
    ]
    t = Table(details_data, colWidths=[150, 350])
    t.setStyle(TableStyle([
        ('GRID', (0,0), (-1,-1), 1, colors.black),
        ('PADDING', (0,0), (-1,-1), 6),
        ('VALIGN', (0,0), (-1,-1), 'TOP')
    ]))
    elements.append(t)
    elements.append(Spacer(1, 12))
    
    # 2. What you implemented
    elements.append(Paragraph("2 What you implemented", section_style))
    impl_data = [
        ["Screen", "Files (class / layout)", "What the user can do", "Status"],
        ["Dashboard", "MainActivity.kt / activity_main.xml", "See total balance and latest expenses", "UI Working"],
        ["Add Expense", "AddExpenseActivity.kt / activity_add_expense.xml", "Enter amount, category, date, note", "UI + Validation"],
        ["Expense List", "ExpenseListActivity.kt / activity_expense_list.xml", "Scroll RecyclerView of expenses", "Working"],
        ["Details", "ExpenseDetailActivity.kt / activity_expense_detail.xml", "View one expense; Edit and Delete buttons", "UI Working"],
        ["Summary", "SummaryActivity.kt / activity_summary.xml", "See per-category amounts for the month", "Static UI Working"]
    ]
    t2 = Table(impl_data, colWidths=[80, 120, 200, 100])
    t2.setStyle(TableStyle([
        ('BACKGROUND', (0,0), (-1,0), colors.lightgrey),
        ('GRID', (0,0), (-1,-1), 1, colors.black),
        ('FONTSIZE', (0,0), (-1,-1), 9),
        ('PADDING', (0,0), (-1,-1), 4)
    ]))
    elements.append(t2)
    elements.append(Spacer(1, 12))
    
    # 3. Testing Results
    elements.append(Paragraph("3 Testing and individual contributions", section_style))
    test_data = [
        ["Test", "Expected Result", "Actual Result"],
        ["Save with empty amount", "Error message shown", "Pass"],
        ["Choose category", "Selected category shown", "Pass"],
        ["Empty list state", "Empty message visible", "Pass"],
        ["Tap expense in list", "Details screen opens", "Pass"],
        ["Rotate to landscape", "No clipping, all visible", "Pass"]
    ]
    t3 = Table(test_data, colWidths=[150, 200, 150])
    t3.setStyle(TableStyle([
        ('BACKGROUND', (0,0), (-1,0), colors.lightgrey),
        ('GRID', (0,0), (-1,-1), 1, colors.black),
        ('PADDING', (0,0), (-1,-1), 4)
    ]))
    elements.append(t3)
    
    # Final Note
    elements.append(Spacer(1, 24))
    elements.append(Paragraph("Note: Screenshots and screen recording are to be attached manually by the user as per SLATE requirements.", styles['Italic']))
    
    doc.build(elements)
    print(f"Report generated: {file_name}")

if __name__ == "__main__":
    generate_report()
