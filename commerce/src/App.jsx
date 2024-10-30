 import './App.css'
  import Registration from './LOG IN/Registration'
  import Login from './LOG IN/Login.jsx'
  import { useState } from 'react';

function App() {

  const [showLogin, setShowLogin] = useState(true);
 
  return (
    <>
    
       {/* <Registration />
       <Login /> */}

       <div className="App">
       {showLogin ? <Login /> : <Registration />}
      <button onClick={() => setShowLogin(!showLogin)}>
        {showLogin ? 'Go to Registration' : 'Go to Login'}
      </button>
    </div>

     </>
  )
}

export default App
