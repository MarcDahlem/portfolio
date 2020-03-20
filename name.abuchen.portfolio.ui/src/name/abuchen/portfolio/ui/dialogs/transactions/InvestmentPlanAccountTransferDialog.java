package name.abuchen.portfolio.ui.dialogs.transactions;

import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

import name.abuchen.portfolio.model.Client;
import name.abuchen.portfolio.model.Transaction;

public class InvestmentPlanAccountTransferDialog extends InvestmentPlanDialog
{

    public InvestmentPlanAccountTransferDialog(@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell, Client client,
                    Class<? extends Transaction> planType)
    {
        super(parentShell, client, planType);
    }

}
