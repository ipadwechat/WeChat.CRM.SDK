// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestTalkDetailTaskResultNotice.proto

package Jubo.JuLiao.IM.Wx.Proto;

public final class RequestTalkDetailTaskResultNotice {
  private RequestTalkDetailTaskResultNotice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestTalkDetailTaskResultNoticeMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 MsgId = 1;</code>
     */
    long getMsgId();

    /**
     * <code>string WeChatId = 2;</code>
     */
    java.lang.String getWeChatId();
    /**
     * <code>string WeChatId = 2;</code>
     */
    com.google.protobuf.ByteString
        getWeChatIdBytes();

    /**
     * <code>string FriendId = 3;</code>
     */
    java.lang.String getFriendId();
    /**
     * <code>string FriendId = 3;</code>
     */
    com.google.protobuf.ByteString
        getFriendIdBytes();

    /**
     * <pre>
     *大图url
     * </pre>
     *
     * <code>bytes Content = 4;</code>
     */
    com.google.protobuf.ByteString getContent();

    /**
     * <code>bool IsOriginal = 5;</code>
     */
    boolean getIsOriginal();
  }
  /**
   * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage}
   */
  public  static final class RequestTalkDetailTaskResultNoticeMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage)
      RequestTalkDetailTaskResultNoticeMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestTalkDetailTaskResultNoticeMessage.newBuilder() to construct.
    private RequestTalkDetailTaskResultNoticeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestTalkDetailTaskResultNoticeMessage() {
      msgId_ = 0L;
      weChatId_ = "";
      friendId_ = "";
      content_ = com.google.protobuf.ByteString.EMPTY;
      isOriginal_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestTalkDetailTaskResultNoticeMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              msgId_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              weChatId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              friendId_ = s;
              break;
            }
            case 34: {

              content_ = input.readBytes();
              break;
            }
            case 40: {

              isOriginal_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.class, Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.Builder.class);
    }

    public static final int MSGID_FIELD_NUMBER = 1;
    private long msgId_;
    /**
     * <code>int64 MsgId = 1;</code>
     */
    public long getMsgId() {
      return msgId_;
    }

    public static final int WECHATID_FIELD_NUMBER = 2;
    private volatile java.lang.Object weChatId_;
    /**
     * <code>string WeChatId = 2;</code>
     */
    public java.lang.String getWeChatId() {
      java.lang.Object ref = weChatId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weChatId_ = s;
        return s;
      }
    }
    /**
     * <code>string WeChatId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWeChatIdBytes() {
      java.lang.Object ref = weChatId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weChatId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FRIENDID_FIELD_NUMBER = 3;
    private volatile java.lang.Object friendId_;
    /**
     * <code>string FriendId = 3;</code>
     */
    public java.lang.String getFriendId() {
      java.lang.Object ref = friendId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        friendId_ = s;
        return s;
      }
    }
    /**
     * <code>string FriendId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFriendIdBytes() {
      java.lang.Object ref = friendId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        friendId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString content_;
    /**
     * <pre>
     *大图url
     * </pre>
     *
     * <code>bytes Content = 4;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    public static final int ISORIGINAL_FIELD_NUMBER = 5;
    private boolean isOriginal_;
    /**
     * <code>bool IsOriginal = 5;</code>
     */
    public boolean getIsOriginal() {
      return isOriginal_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (msgId_ != 0L) {
        output.writeInt64(1, msgId_);
      }
      if (!getWeChatIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, weChatId_);
      }
      if (!getFriendIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, friendId_);
      }
      if (!content_.isEmpty()) {
        output.writeBytes(4, content_);
      }
      if (isOriginal_ != false) {
        output.writeBool(5, isOriginal_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (msgId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, msgId_);
      }
      if (!getWeChatIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, weChatId_);
      }
      if (!getFriendIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, friendId_);
      }
      if (!content_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, content_);
      }
      if (isOriginal_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOriginal_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage)) {
        return super.equals(obj);
      }
      Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage other = (Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage) obj;

      boolean result = true;
      result = result && (getMsgId()
          == other.getMsgId());
      result = result && getWeChatId()
          .equals(other.getWeChatId());
      result = result && getFriendId()
          .equals(other.getFriendId());
      result = result && getContent()
          .equals(other.getContent());
      result = result && (getIsOriginal()
          == other.getIsOriginal());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MSGID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMsgId());
      hash = (37 * hash) + WECHATID_FIELD_NUMBER;
      hash = (53 * hash) + getWeChatId().hashCode();
      hash = (37 * hash) + FRIENDID_FIELD_NUMBER;
      hash = (53 * hash) + getFriendId().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + ISORIGINAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOriginal());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage)
        Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.class, Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.Builder.class);
      }

      // Construct using Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        msgId_ = 0L;

        weChatId_ = "";

        friendId_ = "";

        content_ = com.google.protobuf.ByteString.EMPTY;

        isOriginal_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_descriptor;
      }

      public Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage getDefaultInstanceForType() {
        return Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.getDefaultInstance();
      }

      public Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage build() {
        Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage buildPartial() {
        Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage result = new Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage(this);
        result.msgId_ = msgId_;
        result.weChatId_ = weChatId_;
        result.friendId_ = friendId_;
        result.content_ = content_;
        result.isOriginal_ = isOriginal_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage) {
          return mergeFrom((Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage other) {
        if (other == Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage.getDefaultInstance()) return this;
        if (other.getMsgId() != 0L) {
          setMsgId(other.getMsgId());
        }
        if (!other.getWeChatId().isEmpty()) {
          weChatId_ = other.weChatId_;
          onChanged();
        }
        if (!other.getFriendId().isEmpty()) {
          friendId_ = other.friendId_;
          onChanged();
        }
        if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
          setContent(other.getContent());
        }
        if (other.getIsOriginal() != false) {
          setIsOriginal(other.getIsOriginal());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long msgId_ ;
      /**
       * <code>int64 MsgId = 1;</code>
       */
      public long getMsgId() {
        return msgId_;
      }
      /**
       * <code>int64 MsgId = 1;</code>
       */
      public Builder setMsgId(long value) {
        
        msgId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 MsgId = 1;</code>
       */
      public Builder clearMsgId() {
        
        msgId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object weChatId_ = "";
      /**
       * <code>string WeChatId = 2;</code>
       */
      public java.lang.String getWeChatId() {
        java.lang.Object ref = weChatId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          weChatId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string WeChatId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getWeChatIdBytes() {
        java.lang.Object ref = weChatId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          weChatId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string WeChatId = 2;</code>
       */
      public Builder setWeChatId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        weChatId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string WeChatId = 2;</code>
       */
      public Builder clearWeChatId() {
        
        weChatId_ = getDefaultInstance().getWeChatId();
        onChanged();
        return this;
      }
      /**
       * <code>string WeChatId = 2;</code>
       */
      public Builder setWeChatIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        weChatId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object friendId_ = "";
      /**
       * <code>string FriendId = 3;</code>
       */
      public java.lang.String getFriendId() {
        java.lang.Object ref = friendId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          friendId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string FriendId = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFriendIdBytes() {
        java.lang.Object ref = friendId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          friendId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string FriendId = 3;</code>
       */
      public Builder setFriendId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        friendId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string FriendId = 3;</code>
       */
      public Builder clearFriendId() {
        
        friendId_ = getDefaultInstance().getFriendId();
        onChanged();
        return this;
      }
      /**
       * <code>string FriendId = 3;</code>
       */
      public Builder setFriendIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        friendId_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *大图url
       * </pre>
       *
       * <code>bytes Content = 4;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <pre>
       *大图url
       * </pre>
       *
       * <code>bytes Content = 4;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *大图url
       * </pre>
       *
       * <code>bytes Content = 4;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      private boolean isOriginal_ ;
      /**
       * <code>bool IsOriginal = 5;</code>
       */
      public boolean getIsOriginal() {
        return isOriginal_;
      }
      /**
       * <code>bool IsOriginal = 5;</code>
       */
      public Builder setIsOriginal(boolean value) {
        
        isOriginal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool IsOriginal = 5;</code>
       */
      public Builder clearIsOriginal() {
        
        isOriginal_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage)
    }

    // @@protoc_insertion_point(class_scope:Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNoticeMessage)
    private static final Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage();
    }

    public static Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestTalkDetailTaskResultNoticeMessage>
        PARSER = new com.google.protobuf.AbstractParser<RequestTalkDetailTaskResultNoticeMessage>() {
      public RequestTalkDetailTaskResultNoticeMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestTalkDetailTaskResultNoticeMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestTalkDetailTaskResultNoticeMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestTalkDetailTaskResultNoticeMessage> getParserForType() {
      return PARSER;
    }

    public Jubo.JuLiao.IM.Wx.Proto.RequestTalkDetailTaskResultNotice.RequestTalkDetailTaskResultNoticeMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'RequestTalkDetailTaskResultNotice.prot" +
      "o\022\027Jubo.JuLiao.IM.Wx.Proto\"\202\001\n(RequestTa" +
      "lkDetailTaskResultNoticeMessage\022\r\n\005MsgId" +
      "\030\001 \001(\003\022\020\n\010WeChatId\030\002 \001(\t\022\020\n\010FriendId\030\003 \001" +
      "(\t\022\017\n\007Content\030\004 \001(\014\022\022\n\nIsOriginal\030\005 \001(\010b" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Jubo_JuLiao_IM_Wx_Proto_RequestTalkDetailTaskResultNoticeMessage_descriptor,
        new java.lang.String[] { "MsgId", "WeChatId", "FriendId", "Content", "IsOriginal", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}