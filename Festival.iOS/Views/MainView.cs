// --------------------------------------------------------------------------------------------------------------------
// <summary>
//    Defines the MainView type.
// </summary>
// --------------------------------------------------------------------------------------------------------------------
namespace Festival.iOS.Views
{
    using System.Drawing;

    using Cirrious.MvvmCross.Binding.BindingContext;

    using Core.ViewModels;
    using Foundation;
    using UIKit;

    /// <summary>
    /// Defines the MainView type.
    /// </summary>
    [Register("MainView")]
    public class MainView : BaseView
    {
        /// <summary>
        /// Views the did load.
        /// </summary>
        /// <summary>
        /// Called when the View is first loaded
        /// </summary>
        public override void ViewDidLoad()
        {
            this.View = new UIView { BackgroundColor = UIColor.White };

            base.ViewDidLoad();

            UILabel uiLabel = new UILabel(new RectangleF(10, 10, 300, 40));
            View.AddSubview(uiLabel);
            UITextField uiTextField = new UITextField(new RectangleF(10, 50, 300, 40));
            View.AddSubview(uiTextField);

            var set = this.CreateBindingSet<MainView, MainViewModel>();
            set.Bind(uiLabel).To(vm => vm.MyProperty);
            set.Bind(uiTextField).To(vm => vm.MyProperty);
            set.Apply();

            UITapGestureRecognizer tap = new UITapGestureRecognizer(() => uiTextField.ResignFirstResponder());
            View.AddGestureRecognizer(tap);
        }
    }
}
