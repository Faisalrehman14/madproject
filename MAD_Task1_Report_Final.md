# MAD Lab Project Task 1 Report: SpendWise - Personal Expense Tracker

## 1. Project and Submission Details
- **App Title**: SpendWise - Personal Expense Tracker
- **Section / Task**: Section W / Task 1 (Create the UI and layouts)
- **Submission Date**: 22-10-2026
- **Selected Stack**: Kotlin, Android Studio (Android app in app/src/main; RecyclerView and Material Components)
- **Group ID / Members**:
    - Muhammad Faisal Rehman - SAP ID 70150146
    - Ahmed Shahid - SAP ID 70149224
- **GitHub Repository**: https://github.com/Faisalrehman14/madproject
- **Branch / Commit SHA / Tag**: `main` / `7822b837cb1467381457b8b7a6eb1a3704514aa3` / `task-1`

## 2. Project Proposal Summary
- **Problem**: Students and young earners often do not know where their money goes because they do not record small daily expenses.
- **Solution**: SpendWise lets a user record an expense in a few taps, see all expenses in a list and check a monthly summary by category.
- **Main Users**: University students (primary), Young professionals.
- **Core Features**:
    1. Dashboard with balance and recent expenses.
    2. Add expense form (amount, category, date, note).
    3. Expense list with category labels and empty-list design.
    4. Expense details / edit screen.
    5. Monthly summary by category.

## 3. Implementation Details
The following screens were implemented using static sample data. Each screen is an Activity with its own layout file.

| Screen | Files (class / layout) | What the user can do | Status |
|---|---|---|---|
| Dashboard | MainActivity.kt / activity_main.xml | See total balance and latest expenses; buttons to Add Expense, List and Summary. | UI working with static data |
| Add Expense | AddExpenseActivity.kt / activity_add_expense.xml | Enter amount, category, date, note; validation for empty amount. | UI + validation working |
| Expense List | ExpenseListActivity.kt, ExpenseAdapter.kt / activity_expense_list.xml | Scroll RecyclerView of expenses; empty-list message when no data. | Working with static list |
| Expense Details | ExpenseDetailActivity.kt / activity_expense_detail.xml | View one expense; Edit and Delete buttons (placeholders). | UI working |
| Monthly Summary | SummaryActivity.kt / activity_summary.xml | See total spent and per-category amounts for the month. | Static sample values |

- **Layout Adaptation**: Used ConstraintLayout and ScrollView. Provided landscape variants in `res/layout-land` for Dashboard and Add Expense.
- **Readability**: Minimum 16sp body text, 48dp touch targets, consistent 16dp margins.

## 4. Testing Results
| Test Case | Expected Result | Actual Result |
|---|---|---|
| Save with empty amount | Error message under the field; form stays open | Pass |
| Open Add Expense and choose category | Selected category is shown on the form | Pass |
| Open list with no data | Empty-state message and Add Expense button | Pass |
| Tap an expense in the list | Details screen opens for that expense | Pass |
| Open Monthly Summary | Total and category amounts visible | Pass |
| Rotate to landscape | All controls visible, content scrolls, no clipping | Pass |

## 5. Individual Contributions
| Member | Activity | File / Feature |
|---|---|---|
| Muhammad Faisal Rehman | Dashboard, Add Expense UI, Project Init | MainActivity, AddExpenseActivity |
| Ahmed Shahid | List, Details, Summary UI, Adapter | ExpenseListActivity, SummaryActivity, ExpenseAdapter |

## 6. GitHub Repository Links
- **Repository URL**: https://github.com/Faisalrehman14/madproject
- **Commit Link**: https://github.com/Faisalrehman14/madproject/commit/7822b837cb1467381457b8b7a6eb1a3704514aa3
- **Tag**: `task-1`
