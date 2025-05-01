.class public final synthetic Lcom/join/mgps/activity/g3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;

.field public final synthetic c:Lcom/join/mgps/base/BaseViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;Lcom/join/mgps/base/BaseViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/g3;->b:Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;

    iput-object p2, p0, Lcom/join/mgps/activity/g3;->c:Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/g3;->b:Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;

    iget-object v1, p0, Lcom/join/mgps/activity/g3;->c:Lcom/join/mgps/base/BaseViewHolder;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;->a(Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;Lcom/join/mgps/base/BaseViewHolder;Landroid/view/View;)V

    return-void
.end method
