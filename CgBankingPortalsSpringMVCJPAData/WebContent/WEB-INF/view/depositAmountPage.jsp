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
		<form action="deposit" method="post">
			<table>
				<tr>
					<td>Account Number</td>
					<td><input type="number" name="accountNo"></td>
					<td><input type="submit" value="click"></td>
					<td><a href="index">||Home||</a></td>
				</tr>
				<tr>
					<br><td>Deposit Amount</td>
					<td><input type="number" name="amount"></td>
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
				<th>Amount to deposit
				</th>
				<th>accountBalance</th>
			</tr>
			<tr>
				<td>${depositBalance}</td>
			</tr>
		</table>
	</div>
</body>
</html>