package blockChain;

/*
 * Your wallets balance is the sum of all the unspent transaction outputs addressed to you.
 */

public class TransactionInput
{
	public String transactionOutputId; //Reference to TransactionOutputs -> transactionId
	public TransactionOutput UTXO; //Contains the Unspent transaction output
	
	public TransactionInput(String transactionOutputId) 
	{
		this.transactionOutputId = transactionOutputId;
	}
}
