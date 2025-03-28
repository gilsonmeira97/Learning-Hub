import Job from "./Job";
import JobSource from "../assets/jobs.json";
import JobModel from "../models/Job";


const JobListings = ({ pagination }: { pagination: number }) => {
    let recentJobs = JobSource.slice(0, pagination);

    return (
        <>
            <section className="bg-blue-50 px-4 py-10">
                <div className="container-xl lg:container m-auto">
                    <h2 className="text-3xl font-bold text-indigo-500 mb-6 text-center">
                        Browse Jobs
                    </h2>
                    <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
                        {recentJobs.map((job: JobModel) => { return <Job key={parseInt(job.id)} {...job} /> })}
                    </div>
                </div>
            </section>
        </>
    );
};

export default JobListings;