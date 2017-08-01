package org.openml.experiment.operators;

import java.util.List;

import com.rapidminer.operator.Operator;

/*
 * Wrapper for the SVM with the multiquadric kernel type
 */
public class MultiquadricSVM extends DotSVM 
{
	public MultiquadricSVM(List<String> args, Operator operator) throws Exception
	{
		super(args, operator);
		if(args.size() != 10)
		{
			throw new Exception("Not enough arguments for the MultiquadricSVM");
		}
		setKernelSigma1(args.get(8));
		setKernelShift(args.get(9));
	}
	
	public void setKernelSigma1(String kSigma1)
	{
		this.getOperator().setParameter("kernel_sigma1", kSigma1);
	}
	
	public String getKernelSigma1()
	{
		try
		{
			return this.getOperator().getParameter("kernel_sigma1");
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public void setKernelShift(String kShift)
	{
		this.getOperator().setParameter("kernel_shift", kShift);
	}
	
	public String getKernelShift()
	{
		try
		{
			return this.getOperator().getParameter("kernel_shift");
		}
		catch(Exception e)
		{
			return null;
		}
	}
}