type Job = {
    title: String,
    type: String,
    description:String,
    location: String,
    salary: String,
    company: {name: String, descripton: String, contactEmail: String, contactPhone: String}
}

export default Job;