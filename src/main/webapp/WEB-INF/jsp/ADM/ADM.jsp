<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>CNCC Admin</title>
<!-- Bootstrap Core CSS -->
<link href="/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/css/sb-admin.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div id="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"> <!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="main.html">COIN&COIN Admin</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav">
			<!--                 <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Read All New Messages</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">View All</a>
                        </li>
                    </ul>
                </li> -->
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> 관리자 접속 <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<!--       <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li> -->
					<!-- <li class="divider"></li> -->
					<li><a href="/ADM/logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a></li>
				</ul></li>
		</ul>
		<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav side-nav">
				<!-- <li class="active"> -->
				<li><a href="/main.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a></li>
				<!--                 <li>
                        <a href="/charts"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                    </li>
                    <li>
                        <a href="/tables"><i class="fa fa-fw fa-table"></i> Tables</a>
                    </li>
                    <li>
                        <a href="/froms"><i class="fa fa-fw fa-edit"></i> Forms</a>
                    </li>
                    <li>
                        <a href="/bootstrap-elements"><i class="fa fa-fw fa-desktop"></i> Bootstrap Elements</a>
                    </li>
                    <li>
                        <a href="/bootstrap-grid"><i class="fa fa-fw fa-wrench"></i> Bootstrap Grid</a>
                    </li> -->
				<li><a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-table"></i> 회원 <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo" class="collapse">
						<li><a href="table.html">회원 정보</a></li>
						<li><a href="#">화원 관리</a></li>
						<li><a href="#">회원 인증</a></li>
					</ul></li>
				<li><a href="javascript:;" data-toggle="collapse" data-target="#demo2"><i class="fa fa-fw fa-table"></i> 입·출금 <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo2" class="collapse">
						<li><a href="#">입·출금 내역</a></li>
						<li><a href="#">입·출금 관리</a></li>
					</ul></li>
				<li><a href="javascript:;" data-toggle="collapse" data-target="#demo3"><i class="fa fa-fw fa-table"></i> 출금 <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo3" class="collapse">
						<li><a href="#">인증대기중 내역</a></li>
						<li><a href="#">출금요청 내역</a></li>
						<li><a href="#">출금완료 내역</a></li>
						<li><a href="#">출금 내역</a></li>
					</ul></li>
				<li><a href="#"><i class="fa fa-fw fa-table"></i> 거래 내역 </a></li>
				<li><a href="javascript:;" data-toggle="collapse" data-target="#demo4"><i class="fa fa-fw fa-table"></i> 수수료 <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo4" class="collapse">
						<li><a href="#">수수료 내역</a></li>
						<li><a href="#">수수료 정산</a></li>
					</ul></li>
				<li><a href="javascript:;" data-toggle="collapse" data-target="#demo5"><i class="fa fa-fw fa-table"></i> 코인 <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo5" class="collapse">
						<li><a href="#">코인 관리</a></li>
						<li><a href="#">회원 코인 잔액</a></li>
						<li><a href="#">총 코인 잔액</a></li>
					</ul></li>
				<li><a href="#"><i class="fa fa-fw fa-table"></i> 마켓 관리 </a></li>
				<li><a href="javascript:;" data-toggle="collapse" data-target="#demo6"><i class="fa fa-fw fa-table"></i> 관리자 <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo6" class="collapse">
						<li><a href="#">이용 내역</a></li>
						<li><a href="#">공지 관리</a></li>
						<li><a href="#">게시판 관리</a></li>
						<li><a href="#">포크 관리</a></li>
						<li><a href="#">로그인 내역</a></li>
					</ul></li>
				<li><a href="#"><i class="fa fa-fw fa-table"></i> 지점 관리 </a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse --> </nav>
		<div id="page-wrapper">
			<div class="container-fluid">
				<div id="root"></div>
			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->
	<script src="/js/react/${pageName}.bundle.js"></script>
	<!-- jQuery -->
	<script src="/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="/webjars/github-com-BlackrockDigital-startbootstrap-sb-admin/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
