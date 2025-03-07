import { useEffect, useState } from 'react'
import './App.css'

const Card = ({title}:{title: String}) =>  {
  const [count, setCount] = useState(0);
  const [hasLiked, setHasLiked] = useState(false);
  useEffect(() => {
    console.log(`${title} has been liked: ${hasLiked}`);
  }, [hasLiked])

  return(
    <div className='card' onClick={() => setCount((prevState) => prevState + 1)}>
      <h2>{title} <br /> {count}</h2>
      <button onClick={() => setHasLiked(!hasLiked)}>
        {hasLiked ? '🤍' : '❤️'}
      </button>
    </div>
  )
}

const App = () => {
  return (
    <div className='card-container'>
      <Card title="Avatar"/>
      <Card title="The King Lion"/>
      <Card title="Star Wars"/>
    </div>
  )
}

export default App
