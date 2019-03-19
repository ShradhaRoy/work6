<html>
<head>
<style>
.error {
	color: red;
	font-weight: bold
}
</style>
</head>
<body>
	<div align="center">
		<form action="accountDetails" method="post">
			<table>
				<tr>
					<td>Account Number</td>
					<td><input type="number" name="accountNo"></td>
					<td><input type="submit" value="click"></td>
					<td><a href="index">||Home||</a></td>
				</tr>
			</table>
		</form>
	</div>
	<div align="center" class="error">${errorMessage }</div>
	<br>
	<br>
	<div align="center">
		<table>
			<tr>
				<th>Account Number</th>
				<th>pinNumber</th>
				<th>accountType</th>
				<th>accountStatus</th>
				<th>accountBalance</th>
			</tr>
			<tr>
				<td>${account.accountNo}</td>
				<td>${account.pinNumber}</td>
				<td>${account.accountType}</td>
				<td>${account.accountStatus}</td>
				<td>${account.accountBalance}</td>
			</tr>
		</table>
	</div>
</body>
</html>