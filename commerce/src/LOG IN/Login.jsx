// eslint-disable-next-line no-unused-vars
import React, { useState } from 'react';

const LoginForm = () => {
  const [formData, setFormData] = useState({
    email: '',
    password: '',
  });

  const [error, setError] = useState('');
  const [success, setSuccess] = useState(false);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({ ...prevData, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const { email, password } = formData;

    if (!email || !password) {
      setError('Both fields are required!');
      return;
    }

    // Simulate successful login (replace with real API call later)
    // if (email === 'user@example.com' && password === 'password123') {
    //   setError('');
    //   setSuccess(true);
    //   console.log('Login successful:', formData);
    // } else {
    //   setError('Invalid credentials!');
    //   setSuccess(false);
    // }
  };

  return (
    <div className="login-container">

      <h2>Login</h2>

      {error && <p className="error">{error}</p>}
      
      {success && <p className="success">Login successful!</p>}
      <form onSubmit={handleSubmit}>
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
        <button type="submit">Login</button>
      </form>
    </div>
  );
};

export default LoginForm;
