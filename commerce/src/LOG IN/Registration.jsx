// eslint-disable-next-line no-unused-vars
import React, { useState } from 'react';



const RegistrationForm = () => {
  const [formData, setFormData] = useState({
    first_name: '',
    second_name:'',
    email: '',
    phone_number:'',
    password: '',
    confirmPassword: '',
  });

  const [error, setError] = useState('');
  const [success, setSuccess] = useState(false);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({ ...prevData, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const { first_name, second_name, email, phone_number , password, confirmPassword } = formData;

    if (!first_name || !second_name || !phone_number|| !email || !password || !confirmPassword) {
      setError('All fields are required!');
      return;
    }

    if (password !== confirmPassword) {
      setError('Passwords do not match!');
      return;
    }

    setError('');
    setSuccess(true);
    console.log('User registered:', formData);
    // Here you can integrate your API call for registration
  };

  return (

    <div className="registration-container">
      <h2>REGISTRATION</h2>

      {error && <p className="error">{error}</p>}
      {success && <p className="success">Registration successful!</p>}

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="first_name"
          placeholder="First name"
          value={formData.name}
          onChange={handleChange}
        />
        <input 
            type='text'
            name='second_name'
            placeholder='Second Name'
            value={formData.second_name}
            onChange={handleChange}
        />

        <input 
            type='number'
            name='phone_number'
            placeholder='Phone number'
            value={FormData.phone_number}
            onChange={handleChange}
        />

        <input
          type="email"
          name="email"
          placeholder="Email"
          value={formData.email}
          onChange={handleChange}
        />
        <input
          type="password"
          name="password"
          placeholder="Password"
          value={formData.password}
          onChange={handleChange}
        />
        <input
          type="password"
          name="confirmPassword"
          placeholder="Confirm Password"
          value={formData.confirmPassword}
          onChange={handleChange}
        />

        <button type="submit">Register</button>
        
      </form>
    </div>
  );
};


export default RegistrationForm;
