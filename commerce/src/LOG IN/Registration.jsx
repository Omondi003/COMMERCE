// src/RegistrationForm.js
// eslint-disable-next-line no-unused-vars
import React, { useState } from 'react';
import './Registration.css'


const Registration=()=>{

        const [formData, setFormData] = useState({
        firstname: '',
        secondname:' ',
        email: '',
        phone:'',
        location:'',
        input_password: '',
        confirm_Password:''
    }); 


    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({
            ...formData,
            [name]: value
        });


    };
        const handleSubmit = (e) => {
        e.preventDefault();
 
    };



    return (
        <div className="reg">
            <div className="regimg"></div>
            <form action="" onSubmit={handleSubmit}>

            <div>
                <label htmlFor="Fistname">FIRSTNAME:</label>
                <input type="text" id="firstname" name="Firstname" value={formData.firstname} onChange={handleChange} />
            </div>
        
            <div>
                <label htmlFor="secondname">SECONDNAME:</label>
                <input type="text" id="secondname" name="secondname" value={formData.secondname} onChange={handleChange} />
            </div>

            <div>
                <label htmlFor="email">EMAIL:</label>
                <input type="email" id="email" name="email" value={formData.email} onChange={handleChange} />
            </div>

            <div>
                <label htmlFor="phone">PHONE:</label>
                <input type="number" id="firstname" name="Firstname" value={formData.phone} onChange={handleChange} />
            </div>

            <div>
                <label htmlFor="location">LOCATION:</label>
                <input type="text" id="location" name="location" value={formData.location} onChange={handleChange} />
            </div>

            <div>
                <label htmlFor="input_password">INPUT PASSWORD:</label>
                <input type="text" id="input_password" name="input_password" value={formData.input_password} onChange={handleChange} />
            </div>

            <div>
                <label htmlFor="confirm_password">CONFIRM PASSWORD:</label>
                <input type="text" id="firstname" name="Firstname" value={formData.confirm_Password}  />
            </div>

              <button type='submit'>Register</button>
            </form>
        </div>
    )
}


export default Registration;




 
