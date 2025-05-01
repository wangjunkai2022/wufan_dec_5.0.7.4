.class public Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;
.super Ljava/lang/Object;
.source "H264TrackImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:Z

.field d:I

.field e:I

.field f:Z

.field g:I

.field h:I

.field i:I

.field j:I

.field k:I

.field l:I

.field m:I

.field n:I

.field o:I

.field p:I

.field q:I

.field r:I

.field s:I

.field t:Lcom/googlecode/mp4parser/h264/model/h;

.field final synthetic u:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;Ljava/io/InputStream;Lcom/googlecode/mp4parser/h264/model/h;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 1
    iput-object v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->u:Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 2
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    .line 3
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    .line 4
    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->t:Lcom/googlecode/mp4parser/h264/model/h;

    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    .line 6
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->available()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-lt v4, v3, :cond_0

    return-void

    .line 7
    :cond_0
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    .line 8
    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    .line 9
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    :goto_1
    const/16 v6, 0xff

    if-eq v5, v6, :cond_11

    .line 10
    iget v7, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    add-int/2addr v7, v5

    iput v7, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    .line 11
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    :goto_2
    if-eq v5, v6, :cond_10

    .line 12
    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    add-int/2addr v6, v5

    iput v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    sub-int v5, v3, v4

    if-lt v5, v6, :cond_e

    .line 13
    iget v5, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    const/4 v7, 0x1

    if-ne v5, v7, :cond_c

    .line 14
    iget-object v5, v2, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    if-eqz v5, :cond_a

    iget-object v8, v5, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    if-nez v8, :cond_1

    iget-object v8, v5, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-nez v8, :cond_1

    iget-boolean v5, v5, Lcom/googlecode/mp4parser/h264/model/i;->u:Z

    if-eqz v5, :cond_a

    .line 15
    :cond_1
    new-array v5, v6, [B

    move-object/from16 v8, p2

    .line 16
    invoke-virtual {v8, v5}, Ljava/io/InputStream;->read([B)I

    .line 17
    iget v6, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    add-int/2addr v4, v6

    .line 18
    new-instance v6, Lcom/googlecode/mp4parser/h264/read/b;

    new-instance v9, Ljava/io/ByteArrayInputStream;

    invoke-direct {v9, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v6, v9}, Lcom/googlecode/mp4parser/h264/read/b;-><init>(Ljava/io/InputStream;)V

    .line 19
    iget-object v5, v2, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    iget-object v9, v5, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    if-nez v9, :cond_3

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v5, :cond_2

    goto :goto_3

    .line 20
    :cond_2
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->c:Z

    goto :goto_4

    .line 21
    :cond_3
    :goto_3
    iput-boolean v7, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->c:Z

    .line 22
    iget v5, v9, Lcom/googlecode/mp4parser/h264/model/d;->h:I

    add-int/2addr v5, v7

    const-string v9, "SEI: cpb_removal_delay"

    invoke-virtual {v6, v5, v9}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v5

    iput v5, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->d:I

    .line 23
    iget-object v5, v2, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    iget v5, v5, Lcom/googlecode/mp4parser/h264/model/d;->i:I

    add-int/2addr v5, v7

    const-string v9, "SEI: dpb_removal_delay"

    invoke-virtual {v6, v5, v9}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v5

    iput v5, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->e:I

    .line 24
    :goto_4
    iget-object v5, v2, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    iget-boolean v5, v5, Lcom/googlecode/mp4parser/h264/model/i;->u:Z

    if-eqz v5, :cond_f

    const/4 v5, 0x4

    const-string v9, "SEI: pic_struct"

    .line 25
    invoke-virtual {v6, v5, v9}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v5

    iput v5, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->g:I

    const/4 v9, 0x2

    packed-switch v5, :pswitch_data_0

    const/4 v5, 0x1

    goto :goto_5

    :pswitch_0
    const/4 v5, 0x3

    goto :goto_5

    :pswitch_1
    const/4 v5, 0x2

    :goto_5
    const/4 v10, 0x0

    :goto_6
    if-lt v10, v5, :cond_4

    goto/16 :goto_b

    .line 26
    :cond_4
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "pic_timing SEI: clock_timestamp_flag["

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, "]"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v11

    iput-boolean v11, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->f:Z

    if-eqz v11, :cond_9

    const-string v11, "pic_timing SEI: ct_type"

    .line 27
    invoke-virtual {v6, v9, v11}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v11

    iput v11, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->h:I

    const-string v11, "pic_timing SEI: nuit_field_based_flag"

    .line 28
    invoke-virtual {v6, v7, v11}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v11

    iput v11, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->i:I

    const/4 v11, 0x5

    const-string v12, "pic_timing SEI: counting_type"

    .line 29
    invoke-virtual {v6, v11, v12}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->j:I

    const-string v12, "pic_timing SEI: full_timestamp_flag"

    .line 30
    invoke-virtual {v6, v7, v12}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->k:I

    const-string v12, "pic_timing SEI: discontinuity_flag"

    .line 31
    invoke-virtual {v6, v7, v12}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->l:I

    const-string v12, "pic_timing SEI: cnt_dropped_flag"

    .line 32
    invoke-virtual {v6, v7, v12}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->m:I

    const/16 v12, 0x8

    const-string v13, "pic_timing SEI: n_frames"

    .line 33
    invoke-virtual {v6, v12, v13}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->n:I

    .line 34
    iget v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->k:I

    const-string v13, "pic_timing SEI: hours_value"

    const-string v14, "pic_timing SEI: minutes_value"

    const-string v15, "pic_timing SEI: seconds_value"

    const/4 v1, 0x6

    if-ne v12, v7, :cond_5

    .line 35
    invoke-virtual {v6, v1, v15}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->o:I

    .line 36
    invoke-virtual {v6, v1, v14}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->p:I

    .line 37
    invoke-virtual {v6, v11, v13}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->q:I

    goto :goto_7

    :cond_5
    const-string v12, "pic_timing SEI: seconds_flag"

    .line 38
    invoke-virtual {v6, v12}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 39
    invoke-virtual {v6, v1, v15}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v12

    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->o:I

    const-string v12, "pic_timing SEI: minutes_flag"

    .line 40
    invoke-virtual {v6, v12}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 41
    invoke-virtual {v6, v1, v14}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->p:I

    const-string v1, "pic_timing SEI: hours_flag"

    .line 42
    invoke-virtual {v6, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 43
    invoke-virtual {v6, v11, v13}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->q:I

    .line 44
    :cond_6
    :goto_7
    iget-object v1, v2, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    iget-object v11, v1, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    const/16 v12, 0x18

    if-eqz v11, :cond_7

    .line 45
    iget v1, v11, Lcom/googlecode/mp4parser/h264/model/d;->j:I

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->r:I

    goto :goto_8

    .line 46
    :cond_7
    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v1, :cond_8

    .line 47
    iget v1, v1, Lcom/googlecode/mp4parser/h264/model/d;->j:I

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->r:I

    goto :goto_8

    .line 48
    :cond_8
    iput v12, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->r:I

    :goto_8
    const-string v1, "pic_timing SEI: time_offset"

    .line 49
    invoke-virtual {v6, v12, v1}, Lcom/googlecode/mp4parser/h264/read/b;->w(ILjava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->s:I

    :cond_9
    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x0

    goto/16 :goto_6

    :cond_a
    move-object/from16 v8, p2

    const/4 v1, 0x0

    .line 50
    :goto_9
    iget v5, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    if-lt v1, v5, :cond_b

    goto :goto_b

    .line 51
    :cond_b
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_c
    move-object/from16 v8, p2

    const/4 v1, 0x0

    .line 52
    :goto_a
    iget v5, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    if-lt v1, v5, :cond_d

    goto :goto_b

    .line 53
    :cond_d
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_e
    move-object/from16 v8, p2

    move v4, v3

    .line 54
    :cond_f
    :goto_b
    invoke-static {}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl;->h()Ljava/util/logging/Logger;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_10
    move-object/from16 v8, p2

    .line 55
    iget v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    add-int/2addr v1, v5

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    .line 56
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    const/4 v1, 0x0

    goto/16 :goto_2

    :cond_11
    move-object/from16 v8, p2

    .line 57
    iget v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    add-int/2addr v1, v5

    iput v1, v0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    .line 58
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    const/4 v1, 0x0

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SEIMessage{payloadType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", payloadSize="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    iget v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 6
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->t:Lcom/googlecode/mp4parser/h264/model/h;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    iget-object v2, v1, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    if-nez v2, :cond_0

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v1, :cond_1

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, ", cpb_removal_delay="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dpb_removal_delay="

    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    :cond_1
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->t:Lcom/googlecode/mp4parser/h264/model/h;

    iget-object v1, v1, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    iget-boolean v1, v1, Lcom/googlecode/mp4parser/h264/model/i;->u:Z

    if-eqz v1, :cond_2

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, ", pic_struct="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->g:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->f:Z

    if-eqz v1, :cond_2

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, ", ct_type="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->h:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", nuit_field_based_flag="

    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->i:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", counting_type="

    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->j:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", full_timestamp_flag="

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->k:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", discontinuity_flag="

    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->l:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", cnt_dropped_flag="

    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->m:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", n_frames="

    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->n:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", seconds_value="

    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->o:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", minutes_value="

    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->p:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", hours_value="

    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->q:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", time_offset_length="

    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->r:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", time_offset="

    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/H264TrackImpl$c;->s:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 26
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
