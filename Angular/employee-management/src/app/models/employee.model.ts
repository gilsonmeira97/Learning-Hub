export class Employee {
    employeeId: number;
    employeeName: string;
    contactNo: string;
    emailId: string;
    deptId: number = 0
    password: string;
    gender: string;
    role: string;
    createdDate: string;

    constructor();
    constructor(employeeId?: number,
        employeeName?: string,
        contactNo?: string,
        emailId?: string,
        deptId?: number,
        password?: string,
        gender?: string,
        role?: string,
        createdDate?: string) {
            this.employeeId = employeeId || 0;
            this.employeeName = employeeName || '';
            this.contactNo = contactNo || '';
            this.emailId =emailId || '';
            this.deptId = deptId || 0;
            this.password = password || '';
            this.gender = gender || '';
            this.role = role || 'Employee';
            this.createdDate = createdDate || new Date().toISOString();
    }


}
