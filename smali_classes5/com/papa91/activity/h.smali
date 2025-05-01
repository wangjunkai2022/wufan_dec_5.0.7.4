.class public final synthetic Lcom/papa91/activity/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/papa91/activity/EmuBaseActivity;

.field public final synthetic c:Lcom/papa91/arc/bean/Response;

.field public final synthetic d:Z

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/papa91/activity/EmuBaseActivity;Lcom/papa91/arc/bean/Response;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/papa91/activity/h;->b:Lcom/papa91/activity/EmuBaseActivity;

    iput-object p2, p0, Lcom/papa91/activity/h;->c:Lcom/papa91/arc/bean/Response;

    iput-boolean p3, p0, Lcom/papa91/activity/h;->d:Z

    iput p4, p0, Lcom/papa91/activity/h;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/papa91/activity/h;->b:Lcom/papa91/activity/EmuBaseActivity;

    iget-object v1, p0, Lcom/papa91/activity/h;->c:Lcom/papa91/arc/bean/Response;

    iget-boolean v2, p0, Lcom/papa91/activity/h;->d:Z

    iget v3, p0, Lcom/papa91/activity/h;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/papa91/activity/EmuBaseActivity;->r(Lcom/papa91/activity/EmuBaseActivity;Lcom/papa91/arc/bean/Response;ZI)V

    return-void
.end method
