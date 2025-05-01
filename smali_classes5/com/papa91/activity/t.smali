.class public final synthetic Lcom/papa91/activity/t;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic b:Lcom/papa91/activity/EmuMenuBaseActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/papa91/activity/EmuMenuBaseActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/papa91/activity/t;->b:Lcom/papa91/activity/EmuMenuBaseActivity;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/papa91/activity/t;->b:Lcom/papa91/activity/EmuMenuBaseActivity;

    invoke-static {v0, p1}, Lcom/papa91/activity/EmuMenuBaseActivity;->t(Lcom/papa91/activity/EmuMenuBaseActivity;Landroid/content/DialogInterface;)V

    return-void
.end method
