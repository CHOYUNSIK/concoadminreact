
import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';
// var Router = window.ReactRouter.Router;
// var Route = window.ReactRouter.Route;
// var hashHistory = window.ReactRouter.hashHistory;
// var Link = window.ReactRouter.Link;

class LoginPage extends React.Component {
    constructor(props) {
        super(props);
        this.signIn = this.signIn.bind(this);
        this.handleIdChange = this.handleIdChange.bind(this);
        this.handlePasswordChange = this.handlePasswordChange.bind(this);
        this.state = {
            text: '',
            password: ''
        };

    }
    signIn() {
        if ($("#inputId").val() == "") {
            alert("ID NULL");
            return;
        }
        if ($("#inputPassword").val() == "") {
            alert("PASSWORD NULL");
            return;
        }
        
        
        $.ajax({
            type:"POST",
            url:"/ADM/loginProcess",
            data: {
                "id": this.state.text,
                "pw": this.state.password,
            },
            success:function(obj) { 
                console.log(obj);
                if (obj.ResultCode == "0") {
                    alert('hi');
                    location.href="/ADM/table.html";
                } else if ( obj.ResultCode == "1") {
                    alert('존재하지 않는 아이디 입니다.');
                    $('input[type="password"]').val(""); 
                    return; 
                } else if ( obj.ResultCode == "2") {
                    alert('입력하신 정보가 잘못되었습니다.');
                    $('input[type="password"]').val(""); 
                    return;
                } else if ( obj.ResultCode == "3"){
                    alert('잘못된 접근입니다.');
                    $('input[type="password"]').val(""); 
                    return;
                } else if ( obj.ResultCode == "4") {
                    alert('관리자 외에 접근하실 수 없습니다.');
                    location.replace("/");
                } else {
                    alert('존재하지 않는 아이디 입니다.');
                    $('input[type="password"]').val(""); 
                    $('input[type="password"]').val(""); 
                    return; 
                }
            },
            error:function(e) {
                if (xhr.status == 403) {
                    alert('관리자 외에 접근하실 수 없습니다.');
                    location.replace("/");
                }
            }
        }); 
        
        //axios.post('/ADM/loginProcess', {
/*        axios.post('/signin', {
                id: this.state.text,
                pw: this.state.password,
            "test" : "SDFSDFS"
        })
        
            .then(function (response) {
                console.log(response.data,'then');
            })
            .catch(function (error) {
                console.log(error);
            });*/
    }
    handleIdChange(e) {
     //   console.log({ text: e.target.value });
        this.setState({ text: e.target.value })
    }
    handlePasswordChange(e) {
     //   console.log({ password: e.target.value });
        this.setState({ password: e.target.value })
    }
    render() {

        return (
            <div className="container">
                <div className="card card-login mx-auto mt-5">
                    <div className="card-header"><center><img src="/images/noti_logo.png" width="35" height="35" /> <b>ADMIN LOGIN</b> <img src="/images/noti_logo.png" width="35" height="35" /></center></div>
                    <div className="card-body">
                        {/* <form action="/main.html" method="post"> */}
                        <form>
                            <div className="form-group">
                                <div className="form-label-group">
                                    <input type="text" id="inputId" name="username" className="form-control" onChange={this.handleIdChange} placeholder="ID" required="required" autoFocus="autofocus" />
                                    <label htmlFor="inputId">ID</label>
                                </div>
                            </div>
                            <div className="form-group">
                                <div className="form-label-group">
                                    <input type="password" id="inputPassword" name="password" className="form-control" onChange={this.handlePasswordChange} placeholder="Password" required="required" />
                                    <label htmlFor="inputPassword">Password</label>
                                </div>
                            </div>
                            <div className="form-group">
                                <div className="checkbox">
                                    {/* <!--            <label>
                            <input type="checkbox" value="remember-me">
                            Remember Password
                        </label> --> */}
                                </div>
                            </div>
                            <button className="btn btn-primary btn-block" onClick={this.signIn} type="button">Login</button>
                              {/* <input type="submit" className="btn btn-primary btn-block" value="Login"/> */}
                        </form>
                        {/* <!--         <div class="text-center">
                    <a class="d-block small mt-3" href="register.html">Register an Account</a>
                    <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
                    </div> --> */}
                    </div>
                </div>
            </div>
        );
    }

}


ReactDOM.render(<LoginPage />, document.getElementById('loginroot'));