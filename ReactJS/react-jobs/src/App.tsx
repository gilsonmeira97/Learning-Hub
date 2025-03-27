import { useState } from "react"
import Hero from "./components/Hero"
import HomeCards from "./components/HomeCards"
import JobListings from "./components/JobListings"
import Navbar from "./components/Navbar"
import ViewAllJobs from "./components/ViewAllJobs"

const App = () => {
  const [pagination, setPagination] = useState(3);
  
  function updatePagination() {
    setPagination(value => value + 3)
  }
  
  return (
    <>
      <Navbar />
      <Hero />
      <HomeCards />
      <JobListings pagination={pagination}/>
      <ViewAllJobs updatePagination={updatePagination} />
    </>
  )
}

export default App