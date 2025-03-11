type Department = "HR" | "IT" | "Marketing" | "Manager";
type Employee = {name: String, id: number, department: Department};
type Director = Manager & { getAge: (someValue: number)=> number };
const propName = 'age';
type Manager = Employee & {readonly employers: Employee[], [propName]: number};

const stafA: Employee = {name: "Ana", id: 1, department: "HR"};
const stafB: Employee = {name: "Lua", id: 2, department: "IT"};
const stafC: Manager = {name: "Bia", id: 3, department: "Manager", employers:[stafA, stafB], [propName]: 34};

console.log(stafC);
