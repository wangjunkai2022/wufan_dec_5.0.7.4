.class Lcom/join/mgps/activity/AccountUpgradeActivity$a;
.super Ljava/lang/Object;
.source "AccountUpgradeActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/AccountUpgradeActivity;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:I

.field final synthetic g:Lcom/join/mgps/activity/AccountUpgradeActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/AccountUpgradeActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->g:Lcom/join/mgps/activity/AccountUpgradeActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->e:Ljava/lang/String;

    iput p6, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->g:Lcom/join/mgps/activity/AccountUpgradeActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->e:Ljava/lang/String;

    iget v5, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->f:I

    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/activity/AccountUpgradeActivity;->t0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/AccountUpgradeActivity$a;->g:Lcom/join/mgps/activity/AccountUpgradeActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/AccountUpgradeActivity;->g0(Lcom/join/mgps/activity/AccountUpgradeActivity;)V

    return-void
.end method
