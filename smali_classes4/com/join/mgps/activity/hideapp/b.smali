.class public final synthetic Lcom/join/mgps/activity/hideapp/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;

.field public final synthetic c:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/b;->b:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;

    iput-object p2, p0, Lcom/join/mgps/activity/hideapp/b;->c:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/b;->b:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/b;->c:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->b(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;Landroid/view/View;)V

    return-void
.end method
