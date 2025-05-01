.class public final synthetic Lcom/join/mgps/activity/e1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/MGMainActivity;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/MGMainActivity;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/e1;->b:Lcom/join/mgps/activity/MGMainActivity;

    iput p2, p0, Lcom/join/mgps/activity/e1;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/e1;->b:Lcom/join/mgps/activity/MGMainActivity;

    iget v1, p0, Lcom/join/mgps/activity/e1;->c:I

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/MGMainActivity;->r0(Lcom/join/mgps/activity/MGMainActivity;ILandroid/view/View;)V

    return-void
.end method
