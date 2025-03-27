type Job = {
    id: string,
    title: String,
    type: String,
    description:String,
    location: String,
    salary: String,
    company: {name: String, description: String, contactEmail: String, contactPhone: String}
}

export default Job;