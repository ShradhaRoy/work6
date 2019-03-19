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
		<form action="withdraw" method="post">
			<table>
				<tr>
					<td>Account Number</td>
					<td><input type="number" name="accountNo"></td>
				</tr>
				<tr>
					<br><td>Withdraw Amount</td>
					<td><input type="number" name="amount"></td>
				</tr>
				<tr>
					<br><td>Pin Number</td>
					<td><input type="password" name="pinNumber"></td>
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
				<th>Amount to Withdraw
				</th>
				<th>accountBalance</th>
			</tr>
			<tr>
				<td>${withdrawBalance}</td>
			</tr>
		</table>
	</div>
</body>
</html>