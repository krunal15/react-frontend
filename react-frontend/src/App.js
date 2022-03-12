import React from 'react';
import './App.css';
import Header from './components/Header.js';
import Login from './components/Login.js';
import Home from './components/Home.js';
import {
 
  Switch,
  Route,
} from "react-router-dom";

function App() {



   return (
   
     <div className="App">
     <div>

             <Header />
        </div>

<Switch>
          <Route exact path="/">
            <Home />
          </Route>
          <Route path="/login">
          <Login/>
          </Route>
         
        </Switch>
        
    
    
</div>
 

    
  );
}

export default App;
