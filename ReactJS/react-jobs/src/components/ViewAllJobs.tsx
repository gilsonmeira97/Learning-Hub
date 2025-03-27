const ViewAllJobs = ({ updatePagination }: { updatePagination: () => void }) => {
    return (
        <section className="m-auto max-w-lg my-10 px-6">
            <a
                className="block cursor-pointer bg-black text-white text-center py-4 px-6 rounded-xl hover:bg-gray-700" onClick={updatePagination}
            >View All Jobs</a>
        </section>
    );
};

export default ViewAllJobs;