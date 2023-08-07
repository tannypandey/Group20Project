import React from "react";
import { Form } from "react-router-dom";

export default function Login(){
    return(
        <div className="login-wrapper">
        <Form>
            <h1>Welcome to Safe Bond Banking!</h1>
            <label>
                <p>Username</p>
                <input type="text" />
            </label>
            <label>
                <p>Password</p>
                <input type="password" />
            </label>
            <div>
                <button type="submit">Login</button>
            </div>
        </Form>
        </div>
    )
}