class Solution:
    def getEarningsByDepartment(self, salary_info):
        employee_departments = {}
        
        for info in salary_info:
            name, department, salary = info[0], info[1], int(info[2])
            
            if department not in employee_departments:
                employee_departments[department] = 0
            employee_departments[department] += salary
        
        return sorted(employee_departments.items())