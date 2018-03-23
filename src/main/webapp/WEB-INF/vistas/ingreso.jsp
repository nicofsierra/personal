<%@include file="../../includes/head.jsp"%>

<div class="container center">
	<nav>
		<div class="nav-wrapper">
			<a href="#" class="brand-logo center">Sierra Nicol&aacutes</a>
			<div class="registro">
				<a class="waves-effect waves-light btn" id="ingreso" href="ingreso">Ingresar</a>
				<a class="waves-effect waves-light btn" href="registro">Registrarse</a>
			</div>
			<ul id="nav-mobile" class="left hide-on-med-and-down">
				<li><a href="index">Inicio</a></li>
				<li><a href="trabajos">Trabajos</a></li>
				<li><a href="blog">Blog</a></li>
			</ul>
		</div>
	</nav>
	<section>
		<div class="recuadro">
			<form:form action="validar-ingreso" method="POST"
				modelAttribute="usuario">
				<div class="row iform">
					<div class="input-field col s12">
						<form:input id="email" type="email" class="validate" path="email" />
						<label for="email">Email</label>
					</div>
				</div>
				<div class="row iform">
					<div class="input-field col s12">
						<form:input id="password" type="password" class="validate"
							path="password" />
						<label for="password">Password</label>
					</div>
				</div>
				<div class="row">
					<div class="col s12">
						<button class="btn waves-effect waves-light" type="submit"
							name="action">
							Ingresar <i class="material-icons right">send</i>
						</button>
					</div>
				</div>
				<div class="row">
					<c:if test="${not empty error}">
					<div class="col s12">
						<p style="color:red"> ${error} </p>
					</div>
					</c:if>
				</div>
			</form:form>
		</div>
	</section>
</div>



<%@include file="../../includes/fin.jsp"%>