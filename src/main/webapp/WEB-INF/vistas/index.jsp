<%@include file="../../includes/head.jsp"%>

<div class="container center">
	<nav>
		<div class="nav-wrapper">
			<a href="#" class="brand-logo center">Sierra Nicol&aacutes</a>
			<div class="registro">
				
				
				<c:set var="usuario" value="${usuario}" scope="session" />
				<c:if test="${empty usuario.email}">
					<a class="waves-effect waves-light btn" id="ingreso" href="ingreso">Ingresar</a>
					<a class="waves-effect waves-light btn" href="registro">Registrarse</a>
					 <!-- TODO: hacer botones ingreso y registro para mobile (agregar en todas las vistas) -->
				</c:if>
				<c:if test="${not empty usuario.email}">
					<p> Bienvenido ${usuario.email}, <a href="logout">salir</a> </p>
				</c:if>
			</div>
			<ul id="nav-mobile" class="left hide-on-med-and-down">
				<li><a href="#">Inicio</a></li>
				<li><a href="trabajos">Trabajos</a></li>
				<li><a href="blog">Blog</a></li>
			</ul>
		</div>
	</nav>
	<section>
		<div class="col s12" id="titulo">
			<h4>Dise&ntildeo WEB</h4>
		</div>
		<div class="col s6 center" id="bajada">
			<h6>Sitio dedicado al diseño WEB - Tecnolog&iacutea - Noticias</h6>
		</div>
		<div class="row">
			<div class="col s4" id="col">
				<i class="large material-icons">thumb_up</i> <br>
				<ul class="lista">
					<li>Desarrollos de p&aacuteginas de presentaci&oacuten</li>
					<li>Software a medida para Pymes</li>
					<li>Facturaci&oacuten electr&oacutenica</li>
					<li>etc</li>
				</ul>
			</div>
			<div class="col s4" id="col">
				<i class="large material-icons">keyboard</i>
				<h6></h6>
			</div>
			<div class="col s4" id="col">
				<i class="large material-icons">attach_money</i>
			</div>
		</div>

	</section>

</div>



<%@include file="../../includes/fin.jsp"%>
