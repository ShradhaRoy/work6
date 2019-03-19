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
		<form action="transfer" method="post">
			<table>
				<tr>
					<td>Account Number From</td>
					<td><input type="number" name="accountNoFrom"></td>
				</tr>
				<tr>
					<td>Account Number To</td>
					<td><input type="number" name="accountNoTo"></td>
				</tr>
				<tr>
					<br><td>Pin Number</td>
					<td><input type="password" name="pinNumber"></td>
				</tr>
				<tr>
					<br><td>Transfer Amount</td>
					<td><input type="number" name="transferAmount"></td>
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
				<td>${balance}</td>
			</tr>
		</table>
	</div>
</body>
</html>