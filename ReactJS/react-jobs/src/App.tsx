const App = () => {
  let names: String[] = ['Ana', 'John', 'Brian']
  
  return (
    <>
      <div className="text-5xl">App</div>
      <p>Hello {names[0]}</p>
      <ul>
        {names.map((name, index) => <li key={index}>{name}</li>)}
      </ul>
    </>
  );
};

export default App;